class TreeNode(object):
    def __init__(self,value):
        self.val = value
        self.leftChild = -1
        self.rightChild = -1

    def getValue(self):
        return self.value

    def getLeftChild(self):
        return self.leftChild

    def getRightChild(self):
        return self.rightChild

    def __str__(self):
        return("%s = value, left child %d and right child %d." %(self.val, self.leftChild, self.rightChild))

class Tree(object):
    def __init__(self,n):
        self.nodes = [None]*n
        self.__root=-1
        self.freePtr=0 #free pointer, keeps track of what row in the array it is

    def insertNode(self, newNode, current):
        if self.nodes[current].val>=self.nodes[newNode].val: #if new node less than node being checked
            if self.nodes[current].leftChild == -1: # if has no left child
                self.nodes[current].leftChild = newNode #sets new node to left child
            else:
                self.insertNode(newNode, self.nodes[current].leftChild) #has a left child, so compares new node with current left child
        else: # same logic but with right child
            if self.nodes[current].rightChild == -1:
                self.nodes[current].rightChild = newNode
            else:
                self.insertNode(newNode, self.nodes[current].rightChild)

    def insertVal(self, val):
        if self.__root == -1:
            self.nodes[0] = TreeNode(val)
            self.freePtr = 1
            self.__root = 0
        elif self.freePtr<len(self.nodes):
            self.nodes[self.freePtr] = TreeNode(val)
            self.insertNode(self.freePtr, self.__root)
            self.freePtr += 1

    def printTree(self):
        for i in range (len(self.nodes)):
            print(self.nodes[i])

    def search(self, value, current):
        if(value==self.nodes[current].val):
            return True
        elif(self.nodes[current].leftChild == -1 and self.nodes[current].rightChild == -1):
            return False
        elif(value<self.nodes[current]):
            self.search(self, value, self.nodes[current].leftChild)
        else:
            self.search(self,value, self.nodes[current].rightChild)

    def printinOrder(self, current): #random whiff of logical inspiration that may or may not work
        if(self.nodes[current].leftChild != -1):
            self.printinOrder(self, self.nodes[current].leftChild)
            print(self.nodes[current])
            if (self.nodes[current].rightChild != -1):
                self.printinOrder(self, self.nodes[current].rightChild)
        else:
            if(self.nodes[current].rightChild != -1):
                self.printinOrder(self, self.nodes[current].rightChild)
            print(self.nodes[current])

    def whenFull(self):
        print("The tree is full and can not hold any more nodes")