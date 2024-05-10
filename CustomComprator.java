class Pair implements Comparable<Pair>{
    int i;
    int j;
    double val;
    Pair(int i, int j, double val){
        this.i=i;
        this.j=j;
        this.val=val;
    }
    public int compareTo(Pair p1) {
        return Double.compare(p1.val, this.val);   //for PQ, max heap is formed (i.e Max on top) or you can reverse the variable for minHeap
      // retrun Integer.compare(p1.val,this.val);
    }  
    // public String toString(){
    //     return this.i+" "+this.j+" "+this.val;
    // }
}

// perorityQueue comparator
PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Double.compare((double)arr[a[0]]/arr[a[1]], (double)arr[b[0]]/arr[b[1]])); //not sure min or max heap
