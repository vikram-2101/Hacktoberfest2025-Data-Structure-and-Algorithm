# QueueUsingStacks.py
# Implementing a Queue using two Stacks (list used as stacks)

class QueueUsingStacks:
    def __init__(self):
        self.stack1 = []  # For enqueue
        self.stack2 = []  # For dequeue

    def enqueue(self, value):
        # Add element to the end (top of stack1)
        self.stack1.append(value)

    def dequeue(self):
        # If both stacks are empty, queue is empty
        if not self.stack1 and not self.stack2:
            print("Queue is empty.")
            return None

        # Move all elements from stack1 to stack2 if stack2 is empty
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())

        # Pop from stack2 (front of queue)
        return self.stack2.pop()

    def isEmpty(self):
        # Queue is empty if both stacks are empty
        return not (self.stack1 or self.stack2)


# --- Input + Testing ---
if __name__ == "__main__":
    q = QueueUsingStacks()
    
    print("Enter queue elements separated by spaces:")
    elements = list(map(int, input().split()))
    
    for el in elements:
        q.enqueue(el)
    
    print("\nDequeuing all elements:")
    while not q.isEmpty():
        print(q.dequeue(), end=" ")

    print("\nQueue is now empty.")
