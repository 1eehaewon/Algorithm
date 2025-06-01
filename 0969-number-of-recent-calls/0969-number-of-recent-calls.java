class RecentCounter {

    // 요청(t)을 하나씩 저장 -> t-3000 ~ t 까지에 누적된 요청 개수 구하기
    // 요청 들어오면 큐에 저장 -> t-3000 보다 작은 값은 제거
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t-3000) { // 큐의 앞에서부터 t-3000보다 작은 것 제거
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */