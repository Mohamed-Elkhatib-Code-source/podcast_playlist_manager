class Node {
   int id;
   String title;
   int duration;
   String category;
   Node next;

   public Node(int v1, String v2, int v3, String v4) {
      this.id = v1;
      this.title = v2;
      this.duration = v3;
      this.category = v4;
      this.next = null;
   }
}
