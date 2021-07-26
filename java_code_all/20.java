class Solution{
    public boolean isValid(String s) {
            if(s.length()%2==1) return false;
    		Stack<Character> testStack = new Stack<Character>();
            
    		for(int i=0;i<s.length();i++){
    			if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{')
    				testStack.add(s.charAt(i));
    			else{
    				if(testStack.isEmpty()) return false;
    				if(s.charAt(i)==']')
    					if(testStack.pop()!='[') return false;
    				if(s.charAt(i)==')')
    					if(testStack.pop()!='(') return false;
    				if(s.charAt(i)=='}')
    					if(testStack.pop()!='{') return false;
    					
    				
    				
    			}
    			
    			
    		}
    		
    		return testStack.isEmpty();
    		
    		
    }
}

