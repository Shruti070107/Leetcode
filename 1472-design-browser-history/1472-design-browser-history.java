class BrowserHistory {
    ArrayList <String> hist;
    int curr;

    public BrowserHistory(String homepage) {
        hist= new ArrayList<>();
        hist.add(homepage);
        curr=0;
    }
    
    public void visit(String url) {
        while(hist.size() >curr+1){
            hist.remove(hist.size()-1);
        }
        hist.add(url);
        curr++;
    }
    
    public String back(int steps) {
        curr= Math.max(0,curr-steps);
        return hist.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(hist.size()-1,curr+steps);
        return hist.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */