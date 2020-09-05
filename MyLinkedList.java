package linkedList;

public class MyLinkedList {
			Node head;
		void add(int data) {
			Node node=new Node();
			node.data=data;
			node.next=null;
			if(head==null) {
				head=node;
			}
			else {
				Node n=head;
			
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			}
		}
		
		void addAtStart(int data) {
			Node node=new Node();
			node.data=data;
			node.next=head;
			head=node;
		}
		void add(int index,int data ) {
			Node node=new Node();
			node.data=data;
			node.next=null;
			if((index==0)) addAtStart(data);
			
			else {
				Node n=head;
				for(int i=0;i<index-1;i++) {
					n=n.next;
				}
				node.next=n.next;
				n.next=node;
			}
		}
		void remove(int index) {
			if(index==0) head=head.next;
			else {
				Node n=head;
				Node n1=null;
				for(int i=0;i<index-1;i++) {
					n=n.next;
				}
				n1=n.next;
				n.next=n1.next;
			}
			
		}
		void print() {
			Node n=head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
		}
		public static void main(String[] args) {
			MyLinkedList ml=new MyLinkedList();
			ml.add(9);
			ml.add(6);
			ml.add(9);
			ml.addAtStart(8);
//			ml.print();
			ml.add(2,7);
			ml.remove(3);
			ml.print();
		}
		
		
}
