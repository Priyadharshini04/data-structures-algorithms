package com.myjava.strivers.stackqueue;
// https://www.codingninjas.com/studio/problems/implement-queue-using-arrays_8390825
public class QueueImplementation {
	class Queue {
        int front, rear;
        int []arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            arr[rear++]=e;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
        	if(size()==0)
        	{
        		return -1;
        	}
        	return arr[front++];
        }
        public int size()
        {
        	return rear-front;
        }
    }
}
