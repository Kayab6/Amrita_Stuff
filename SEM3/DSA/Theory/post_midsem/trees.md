# Trees in Data Structures — Basic Properties

## 1. What is a Tree?
A tree is a non-linear data structure consisting of nodes connected by edges. It represents hierarchical relationships.

Example:

        A
       / \
      B   C
     / \   \
    D   E   F

## 2. Root Node
The topmost node of a tree.

Example: `A`

## 3. Parent and Child
- **Parent:** A node directly above another node.
- **Child:** A node directly below its parent.

Example:
- `A` is the parent of `B` and `C`.
- `B` is the parent of `D` and `E`.
- `D` is a child of `B`.

## 4. Ancestor and Descendant
- **Ancestor:** Any node above a given node along its path to the root.
- **Descendant:** Any node below a given node in its subtree.

Example:
- Ancestors of `E`: `B`, `A`
- Descendants of `B`: `D`, `E`

## 5. Leaf Node
A node that has no children.

Example: `D`, `E`, `F`

## 6. Size of a Tree
The total number of nodes in a tree.

Example:
Nodes = A, B, C, D, E, F

**Size = 6 nodes**

## 7. Height of a Tree
The height is the number of edges in the longest downward path from the root to a leaf.

Example:
- Height of `D` = 0
- Height of `B` = 1
- Height of `A` = 2

**Height of the tree = 2 edges**

Note: Some textbooks count nodes instead of edges, so follow your course's convention.

## 8. Level of a Node
The level indicates how far a node is from the root.

If the root is at level 0:

- `A` → Level 0
- `B`, `C` → Level 1
- `D`, `E`, `F` → Level 2

Some textbooks start the root at level 1.

## 9. Important Properties
1. A tree with `n` nodes has `n - 1` edges.
2. The root has no parent.
3. Every non-root node has exactly one parent in a rooted tree.
4. A leaf node has no children.
5. The height of a tree equals the height of its root.
6. Depth is the number of edges from the root to a node.

## 10. Quick Revision

| Property | Meaning |
|---|---|
| Root | Topmost node |
| Parent | Node directly above another |
| Child | Node directly below another |
| Ancestor | Node above a given node |
| Descendant | Node below a given node |
| Leaf | Node with no children |
| Size | Total number of nodes |
| Height | Longest downward path |
| Level | Position relative to the root |