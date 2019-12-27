class TreeNode2(object):
    def __init__(self, value):
        self.val = value
        self.leftchild = None
        self.rightchild = None

    def getLeftChild(self):
        return self.leftchild

    def getRightChild(self):
        return self.rightchild

    def setLeftChild(self, lchild):
        self.leftchild = lchild

    def setRightChild(self, rchild):
        self.rightchild = rchild

    def getValue(self):
        return self.val

    def __str__(self):
        print(self.val)


class Tree2(object):
    def __init__(self, root):
        self.root = root

    def insertNode(self, node, current):
        if node.getValue() < current.getValue():
            if current.getLeftChild() is None:
                current.setLeftChild(node)
            else:
                self.insertNode(node, current.getLeftChild())
        else:
            if current.getRightChild() is None:
                current.setRightChild(node)
            else:
                self.insertNode(node, current.getRightChild())

    def insertVal(self, val):
        node = TreeNode2(val)
        self.insertNode(node, self.root)

    def searchTree(self, node, current):
        if current is None:
            return False
        if node.getValue() == current.getValue():
            return True
        if node.getValue() < current.getValue():
            self.searchTree(node, current.getLeftChild())
        else:
            self.searchTree(node, current.getRightChild())

    def searchVal(self, val):


