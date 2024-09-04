import os
import re

"""
parses all aufgabe.md files in sidequests to generate a HTML screenplay table aka drehbuch for OneNote
"""

css="""
<style>
  body {
    font-family: sans-serif;
  }
  td {
    text-align: center;
  }
  td:last-child {
    /*display: none;*/
    text-align: left;
    padding-left: 5px;
  }
  
</style>
"""

def makeTD(content):
    """
    Creates a table cell with the specified content.

    Parameters:
    content (any): The content to be included in the table cell.

    Returns:
    str: The table cell HTML string.
    """
    return f"<td>{content}</td>"

def makeTH(content):
    """
    Function to create a table header cell with the given content.

    Args:
    content (str): The content to be displayed inside the table header cell.

    Returns:
    str: The table header cell HTML element.
    """
    return f"<th>{content}</th>"

# parse strings like ## Zeit - 60 Minuten
def parseAufgabeMD(file):
    """
    Parse the contents of the given file to extract 'zeit' and 'hanok' information.

    Args:
        file (str): The path to the file to be parsed.

    Returns:
        dict: A dictionary containing the 'zeit' and 'hanok' information.
    """
    zeit = None
    hanok = ""
    inside_block = False
    with open(file) as f:
        for line in f:
            if line.startswith("## Zeit - "):
                try:
                    zeit = re.findall(r'\d+', line)[0]
                except IndexError:
                    print(f"Zeit not found in {line}")
                    zeit = None
                break
        for line in f:
            if line.lower().startswith('## hanok'):
                inside_block = True
            elif line.startswith('##') and inside_block:
                break
            elif inside_block:
                hanok += f"{line}<br>"
    return {
        'zeit': zeit,
        'hanok': hanok
    }

class Sidequest:
    """
    A storage class to represent sidequest information.
    """
    def __init__(self, block_nr, block_char, titel, zeit, hanok):
        self.block_nr = block_nr
        self.block_char = block_char
        self.titel = titel
        self.zeit = zeit
        self.hanok = hanok


if __name__ == "__main__":

    folder = './sidequests'
    subfolders = [ f.path for f in os.scandir(folder) if f.is_dir() ]

    blocks = []

    pattern = pattern = r'(\d+)([a-zA-Z])_(.*)'

    for dir in subfolders:
        sq_name = dir.replace(folder+"/", '')
        matches = re.findall(pattern, sq_name)

        print(sq_name)
        block_nr = matches[0][0] # sq_name[0]
        block_char = matches[0][1] # sq_name[1].upper()
        titel =  matches[0][2]
        if (titel.lower().startswith('beispiel') and block_nr == '1' and block_char.lower() == 'a'):
            continue

        content = parseAufgabeMD(f"{dir}/aufgabe.md")
        zeit = content.get('zeit')
        hanok = content.get('hanok')

        sidequest = Sidequest(block_nr, block_char, titel, zeit, hanok)
        blocks.append(sidequest)

    blocks.sort(key=lambda x: (int(x.block_nr), x.block_char))
    headers = ['Block Nr', 'Block Char', 'Titel', 'Zeit', 'HANOK']
    headers = ''.join(map(lambda x: f"<th>{x}</th>", headers))
    rows = ''.join(map(lambda x: f"<tr>{makeTD(x.block_nr)}{makeTD(x.block_char)}{makeTD(x.titel)}{makeTD(x.zeit)}{makeTD(f'<code>{x.hanok}</code>')}</tr>", blocks))

    drehbuch = f"<table border=1><tr>{headers}</tr>{rows}</table>"

    with open ('drehbuch.html', 'w') as f:
        f.write(css)
        f.write(drehbuch)