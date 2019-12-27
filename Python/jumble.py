def solverecursive(letters, k, permutation, used):
    if k == len(letters):
        result = form(letters,permutation)
        if result in dictionary:
            print("A permutation of", letters, "that is a valid word is", result+".")
    else:
        for x in range(0, len(used)):
            if not used[x]:
                permutation[k] = x
                used[x] = True

                solverecursive(letters, k+1, permutation, used)
                used[x] = False


def form(letters, permutation):
    result = ""
    for x in range(0, len(permutation)):
        result += letters[permutation[x]]
    return result


file = open("dictionary.in", "r")
n = int(file.readline()[:-1])
dictionary = []
for x in range(0, n):
    dictionary.append(file.readline()[:-1])
file.close()
numPuzzles = int(input())
for loop in range(1, numPuzzles+1):
    print("Jumble #%s:"%(loop))
    letters = input()

    permutation = [0]*len(letters)
    used = [False]*len(letters)
    solverecursive(letters, 0, permutation, used)
    print()
