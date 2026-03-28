class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens){
            stack.push(
              switch (token) {
                  case "+" -> stack.pop() + stack.pop();
                  case "-" -> -stack.pop() + stack.pop();
                  case "*" -> stack.pop() * stack.pop();
                  case "/" -> {
                      int a = stack.pop();
                      int b = stack.pop();
                      yield b / a;
                  }
                  default -> Integer.parseInt(token);
              }
            );
        }

      return stack.firstElement();
    }
}