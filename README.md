# dll-project-team-8
Data Structures and Algorithms group 8 showcasing Double Linked Lists(DLL) with an explanation

Functions Explained
- insertAtFront(int newData)
What it does: Adds a new node to the start of the list.
How it works: Creates a new node with the given data. This new node's next link points to the current head of the list, becoming the new first node. If the list isn't empty, it also sets the old head's previous link to this new node.

- insertAtIndex(int newData, int index)
What it does: Inserts a new node at a specific position in the list.
How it works: Starts at the head and walks down the list to the specified position. Then, it inserts a new node by adjusting the next and previous links of the neighboring nodes to include the new one. If the index is 0, it just uses insertAtFront.

- insertAtBack(int newData)
What it does: Adds a new node to the end of the list.
How it works: If the list is empty, the new node becomes the head. Otherwise, it walks to the end of the list and attaches the new node there, adjusting the last node's next link and the new node's previous link to connect them.

- deleteNode(int key)
What it does: Removes a node with a specific value from the list.
How it works: Searches the list for a node with the given value. Once found, it removes this node by adjusting the next and previous links of the surrounding nodes to bypass the one being removed.

- search(int key)
What it does: Finds the position of a node with a specific value.
How it works: Starts at the head and walks through the list, keeping count until it finds a node with the given value. Returns the position of this node.

- displayListFromStart()
What it does: Prints the values of all nodes from the beginning to the end.
How it works: Starts at the head and moves forward, printing the data of each node until it reaches the end of the list.

- displayListFromEnd()
What it does: Prints the values of all nodes from the end to the beginning.
How it works: First, it goes to the last node. Then, it moves backward, printing the data of each node until it reaches the start of the list.

The main method demonstrates using these functions to manipulate a doubly linked list:

It starts by creating an empty list.
Adds elements to the list at the front, back, and a specific index.
Displays the list after each operation to show the current arrangement of nodes.
Deletes a node with a specific value and shows how the list looks afterward.
Searches for a node by value and displays its position in the list.