package com.amazon;

public class TestAmazon {

	
	public class MinHeap<V> {

		 

        public class Node<E> implements Comparable<Node<E>> {



                        private E value;

                        private int usage;



                        public Node(E val) {



                                        this.value = val;

                        }



                        public void incrementUsage() {



                                        usage++;

                        }



                        @Override public int compareTo(Node<E> o) {



                                        return usage - o.usage;

                        }



        }



        private Node<V>[] nodes;

        private int size;



        public MinHeap(int s) {



                        this.nodes = (Node<V>[]) new Node[s];

        }



        public void insert(V val) {



                        Node<V> node = new Node<V>(val);

                        nodes[++size] = node;

                        swim(size);

        }



        public V getAndIncrementMin() {



                        Node<V> v = nodes[1];

                        v.incrementUsage();

                        swap(1, size);

                        sink(1);

                        return v.value;

        }



        private void swim(int k) {



                        while (k > 1 && greater(k, k / 2)) {

                                        swap(k, k / 2);

                                        k = k / 2;

                        }

        }



        private void sink(int k) {



                        while (2 * k <= size) {

                                        int j = 2 * k;

                                        if (j < size && greater(j, j + 1))

                                                        j++;

                                        if (!greater(k, j))

                                                        break;

                                        swap(k, j);

                                        k = j;

                        }

        }



        private void swap(int a, int b) {



                        Node<V> temp = nodes[a];

                        nodes[a] = nodes[b];

                        nodes[b] = temp;

        }



        private boolean greater(int i, int j) {



                        return nodes[i].compareTo(nodes[j]) > 0;

        }

}


}
