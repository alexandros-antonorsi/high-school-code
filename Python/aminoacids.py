combos = {
    'TTT': 'Phe',
    'TTC': 'Phe',
    'TTG': 'Leu',
    'TTA': 'Leu',
    'TCT': 'Ser',
    'TCC': 'Ser',
    'TCG': 'Ser',
    'TCA': 'Ser',
    'TGT': 'Cys',
    'TGC': 'Cys',
    'TGG': 'Trp',
    'TGA': '***',
    'TAT': 'Tyr',
    'TAC': 'Tyr',
    'TAG': '***',
    'TAA': '***',
    'CTT': 'Leu',
    'CTC': 'Leu',
    'CTG': 'Leu',
    'CTA': 'Leu',
    'CCT': 'Pro',
    'CCC': 'Pro',
    'CCG': 'Pro',
    'CCA': 'Pro',
    'CGT': 'Arg',
    'CGC': 'Arg',
    'CGG': 'Arg',
    'CGA': 'Arg',
    'CAT': 'His',
    'CAC': 'His',
    'CAG': 'Gln',
    'CAA': 'Gln',
    'GTT': 'Val',
    'GTC': 'Val',
    'GTG': 'Val',
    'GTA': 'Val',
    'GCT': 'Ala',
    'GCC': 'Ala',
    'GCG': 'Ala',
    'GCA': 'Ala',
    'GGT': 'Gly',
    'GGC': 'Gly',
    'GGG': 'Gly',
    'GGA': 'Gly',
    'GAT': 'Asp',
    'GAC': 'Asp',
    'GAG': 'Glu',
    'GAA': 'Glu',
    'ATT': 'Ile',
    'ATC': 'Ile',
    'ATG': 'Met',
    'ATA': 'Ile',
    'ACT': 'Thr',
    'ACC': 'Thr',
    'ACG': 'Thr',
    'ACA': 'Thr',
    'AGT': 'Ser',
    'AGC': 'Ser',
    'AGG': 'Arg',
    'AGA': 'Arg',
    'AAT': 'Asn',
    'AAC': 'Asn',
    'AAG': 'Lys',
    'AAA': 'Lys'
}

names = {
    'Ala': 'A',
    'Cys': 'C',
    'Asp': 'D',
    'Glu': 'E',
    'Phe': 'F',
    'Gly': 'G',
    'His': 'H',
    'Ile': 'I',
    'Lys': 'K',
    'Leu': 'L',
    'Met': 'M',
    'Asn': 'N',
    'Pro': 'P',
    'Gln': 'Q',
    'Arg': 'R',
    'Ser': 'S',
    'Thr': 'T',
    'Val': 'V',
    'Trp': 'W',
    'Tyr': 'Y',
    '***': '*'
}

acid = (raw_input('Enter a nucleotide sequence, or just press ENTER to quit: ')).replace(' ', '')

while acid != "":
    while (len(acid) % 3 != 0):
        print("You must enter a complete set of sequences.")
        acid = raw_input('Enter a nucleotide sequence, or just press ENTER to quit: ')
    if acid == "":
        break
    # input is valid, may proceed
    oneletter = ""
    for x in range(0, len(acid), 3):
        seq = acid[x:x + 3].upper()
        if seq not in combos:
            name = 'invalid sequence'
            let = '?'
        else:
            name = combos[seq]
            let = names[name]
        print(seq + '\t' + name)
        oneletter += let
    print("One-letter abbreviations: " + oneletter)
    acid = raw_input('Enter a nucleotide sequence, or just press ENTER to quit: ')
