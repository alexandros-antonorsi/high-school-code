class Stack(object):
    def __init__(self, value):
        self.n = value
        self.stack = [None]*self.n
        self.pos = 0

    def push(self, item):
        if(self.pos==self.n):
            print("Stack already full")
        else:
            self.stack[self.pos] = item
            self.pos += 1

    def pop(self):
        if(self.pos==0):
            print("Stack already empty")
        else:
            self.stack[self.pos-1] = None
            self.pos -= 1

    def top(self):
        if(self.pos==0):
            print("Stack is empty")
        else:
            print(self.stack[self.pos-1])

    def printstack(self):
        for item in self.stack:
            print(item)

