# BOJ_Algorithm_Study
백준 알고리즘 어렵게 풀었던 문제들 기록

### 1076번 : 저항 
* 나 : 색, 값, 곱의 데이터를 전부 배열로 생성해서 입력받은 값을 배열끼리 비교하고 처음 받은 두 값은 String으로 붙이고 마지막 값은 int형으로 곱했다.
* 다른 사람의 코드 : 색만 배열로 생성하고 입력값과 색 배열이 같은 경우에 i의 값을 이용하여 값과 곱을 구하고 마지막에 연산하여 결과를 구했다.
* 결론 : 내 코드는 형변환이 자주 일어나는 데에 비해서 다른 사람의 코드는 그럴 필요가 없다.

### 1924번 : 2007년(작성중...)
* 나 : 월,일을 받고 String 변수로 날짜 형식에 맞게 저장을 해준 뒤 날짜 함수를 이용하여 해당 날짜에 속하는 요일을 출력하였다.

### 10808번 : 알파벳 개수 
* 나 : 알파벳을 하나씩 배열에 저장하고, 입력받은 문자열을 잘라서 배열과 배열을 비교하여서 숫자를 증가시켰다.
* 다른 사람의 코드 : 입력한 문자열에서 'a'를 뺀 값을 배열의 자리수로 만들어 숫자를 증가시켰다. (아스키코드 사용)
* 결론 : 코드의 길이부터 확연한 차이가 있고 아스키코드를 잘 이용할 줄 알면 코드 수를 줄일 수 있음을 알았다. 

### 10952번 : A+B - 5 
* 나 : 두 숫자가 0을 받기 전까지 숫자를 더한 값을 스트링버퍼에 저장하고 0을 받으면 한번에 나오도록 출력했다.
* 다른 사람의 코드 : 숫자를 입력 받고 0이 아니면 바로 나오도록 출력했다.
* 결론 : 문제에서 예제로 준 출력값이 항상 한번에 다 나와야 하는 줄 알고 스트링버퍼를 썼는데 그게 아니었다..
