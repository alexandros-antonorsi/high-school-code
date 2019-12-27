def parsevalues(firstequation):
    firstVals = [0, 0, 0]
    if "+" in firstequation:
        operation = firstequation.find("+")
    elif "-" in firstequation:
        operation = firstequation.find("-")
    else:  # if its a monomial
        operation = None
        if "^" in firstequation:
            firstVals[0] = firstequation[:firstequation.find("x")]
        elif "x" in firstequation:
            firstVals[1] = firstequation[:firstequation.find("x")]
        else:
            firstVals[2] = firstequation

    if operation != None:  # not a monomial
        if "^" in firstequation:  # parses first term. it can only either be a x^2 or x
            firstVals[0] = firstequation[:firstequation.find("x")]
        else:
            firstVals[1] = firstequation[:firstequation.find("x")]

        secondTerm = firstequation[operation:]
        if "x" in secondTerm:  # parses second term. can only be x or a constant
            firstVals[1] = secondTerm[:secondTerm.find("x")]
        else:
            firstVals[2] = secondTerm

    # converts to floats and makes any empty strings into a 1
    for x in range(0, 3):
        if firstVals[x] == "" or firstVals[x] == "+":
            firstVals[x] = 1.0
        elif firstVals[x] == "-":
            firstVals[x] = -1.0
        else:
            firstVals[x] = float(firstVals[x])

    return firstVals


def display(arr):
    string = ""
    for x in range(0, 3):
        if x == 0 and arr[x] != 0:
            if arr[x] == 1:
                string += "x^2"
            elif arr[x] == -1:
                string += "-x^2"
            else:
                string += str(arr[x])+"x^2"
        elif x == 1 and arr[x] != 0:
            if string != "" and arr[x] > 0:
                string += "+"
            if arr[x] == 1:
                string += "x"
            elif arr[x] == -1:
                string += "-x"
            else:
                string += str(arr[x])+"x"
        elif arr[x] != 0:
            if string != "" and arr[x] > 0:
                string += "+"
            string += str(arr[x])
    return string


def add(func1, func2):
    newvals = [0, 0, 0]
    for x in range(0, 3):
        newvals[x] = func1[x] + func2[x]
    return newvals


def subtract(func1, func2):
    newvals = [0, 0, 0]
    for x in range(0, 3):
        newvals[x] = func1[x] - func2[x]
    return newvals


def multiply(func1, func2):
    newvals = [0,0,0,0,0]
    newvals[0] = func1[0] * func2[0]
    newvals[1] = (func1[0] * func2[1]) + (func1[1] * func2[0])
    newvals[2] = (func1[0] * func2[2]) + (func1[1] * func2[1]) + (func1[2] * func2[0])
    newvals[3] = (func1[1] * func2[2]) + (func1[2] * func2[1])
    newvals[4] = func1[2] * func2[2]
    squared = [newvals[2], newvals[3], newvals[4]]
    string = display(squared)
    newstring = ""
    if newvals[0] != 0:
        if newvals[0] == 1:
            newstring += "x^4"
        elif newvals[0] == -1:
            newstring += "-x^4"
        else:
            newstring += str(newvals[0]) + "x^4"
    if newvals[1] != 0:
        if newstring != "" and newvals[1] > 0:
            newstring += "+"
        if newvals[1] == 1:
            newstring += "x^3"
        elif newvals[1] == -1:
            newstring += "-x^3"
        else:
            newstring += str(newvals[1]) + "x^3"
    if newstring != "" and string[0] != "-":
        newstring += "+"
    print(newstring+string)


def divide(func1, func2):
    if func1[0] != 0 and func1[1] != 0 and func2[0] !=0 and func2[1] !=0 and (func1[0]/func2[0]).is_integer() and (func1[1]/func2[1]).is_integer(): #both are x^2+x
        #if func1[0]/func2[0] == func1[1]/func2[1]:
            print(str(func1[1]/func2[1]))

    elif func1[0] != 0 and func1[1] != 0 and func2[1] != 0 and func2[2] !=0 and (func1[0]/func2[1]).is_integer() and (func1[1]/func2[2]).is_integer(): #x^2+x and x+1
        #if func1[0]/func2[1] == func1[1]/func2[2]:
            print(str(func1[0]/func2[1])+"x")

    elif func1[0] != 0 and func1[1] != 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[0]/func2[2]).is_integer() and (func1[1]/func2[2]).is_integer(): #x^2+x and 1
        #if func1[0]/func2[2] == func1[1]/func2[2]:
            print(str(func1[0]/func2[2])+"x^2"+str(func1[0]/func2[2])+"x")

    elif func1[0] != 0 and func1[1] != 0 and func2[0] == 0 and func2[1] != 0 and func2[2] == 0 and (func1[0] / func2[1]).is_integer() and (func1[1] / func2[1]).is_integer():  # x^2+x and x
        #if func1[0] / func2[1] == func1[1] / func2[1]:
            print(str(func1[0] / func2[1]) + "x" + str(func1[0] / func2[1]))

    elif func1[0] != 0 and func1[2] != 0 and func2[0] !=0 and func2[2] != 0 and (func1[0]/func2[0]).is_integer() and (func1[2]/func2[2]).is_integer():#both x^2+1
        #if func1[0] / func2[0] == func1[2] / func2[2]:
            print(str(func1[0]/func2[0]))

    elif func1[0] != 0 and func1[2] != 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[0]/func2[2]).is_integer() and (func1[2]/func2[2]).is_integer(): #x^2+1 and 1
        #if func1[0]/func2[2] == func1[2]/func2[2]:
            print(str(func1[0]/func2[2])+"x^2"+str(func1[0]/func2[2]))

    elif func1[0] != 0 and func1[1] == 0 and func1[2] == 0 and func2[0] != 0 and func2[1] == 0 and func2[2] == 0 and (func1[0]/func2[0]).is_integer(): #both x^2
        print(str(func1[0]/func2[0]))

    elif func1[0] != 0 and func1[1] == 0 and func1[2] == 0 and func2[0] == 0 and func2[1] != 0 and func2[2] == 0 and (func1[0]/func2[1]).is_integer(): #x^2 and x
        print(str(func1[0]/func2[1]))

    elif func1[0] != 0 and func1[1] == 0 and func1[2] == 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[0]/func2[2]).is_integer(): #x^2 and 1
        print(str(func1[0]/func2[2]))

    elif func1[1] !=0 and func1[2] != 0 and func2[1] != 0 and func2[2] !=0 and (func1[1]/func2[1]).is_integer() and (func1[2]/func2[2]).is_integer(): #both x+1
        #if func1[1] / func2[1] == func1[2] / func2[2]:
            print(str(func1[1]/func2[1]))

    elif func1[1] != 0 and func1[2] != 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[1] / func2[2]).is_integer() and (func1[2] / func2[2]).is_integer():  # x+1 and 1
        #if func1[1] / func2[2] == func1[2] / func2[2]:
            print(str(func1[1] / func2[2]) + "x" + str(func1[2] / func2[2]))

    elif func1[0] == 0 and func1[1] != 0 and func1[2] == 0 and func2[0] == 0 and func2[1] != 0 and func2[2] == 0 and (func1[1]/func2[1]).is_integer(): #x and x
        print(str(func1[1]/func2[1]))

    elif func1[0] == 0 and func1[1] != 0 and func1[2] == 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[1]/func2[2]).is_integer(): #x and 1
        print(str(func1[1]/func2[2]))

    elif func1[0] ==0 and func1[1] == 0 and func1[2] != 0 and func2[0] == 0 and func2[1] == 0 and func2[2] != 0 and (func1[2]/func2[2]).is_integer(): #both constant
        print(str(func1[2]/func2[2]))

    else:
        print("NONE")


for x in range(0,2):
    equations = input()
    firstVals = parsevalues(equations[:equations.find(",")])
    secondVals = parsevalues(equations[equations.find(",") + 1:])
    print(display(add(firstVals, secondVals)))
    print(display(subtract(firstVals, secondVals)))
    multiply(firstVals, secondVals)
    divide(firstVals, secondVals)
    # print(display(compose(firstVals,secondVals)))

