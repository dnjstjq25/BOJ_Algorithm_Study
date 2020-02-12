# BOJ_Algorithm_Study
백준 알고리즘 어렵게 풀었던 문제들 기록

### 10808번 : 알파벳 개수 
* 나 : 알파벳을 하나씩 배열에 저장하고, 입력받은 문자열을 잘라서 배열과 배열을 비교하여서 숫자를 증가시켰다.
* 다른 사람의 코드 : 입력한 문자열에서 'a'를 뺀 값을 배열의 자리수로 만들어 숫자를 증가시켰다. (아스키코드 사용)
* 결론 : 코드의 길이부터 확연한 차이가 있고 아스키코드를 잘 이용할 줄 알면 코드 수를 줄일 수 있음을 알았다. 

### 10952번 : A+B - 5 
* 나 : 두 숫자가 0을 받기 전까지 숫자를 더한 값을 스트링버퍼에 저장하고 0을 받으면 한번에 나오도록 출력했다.
* 다른 사람의 코드 : 숫자를 입력 받고 0이 아니면 바로 나오도록 출력했다.
* 결론 : 문제에서 예제로 준 출력값이 항상 한번에 다 나와야 하는 줄 알고 스트링버퍼를 썼는데 그게 아니었다..
