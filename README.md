# BOJ_Algorithm_Study
백준 알고리즘 어렵게 풀었던 문제들 기록

### 1076번 : 저항 
* 나 : 색, 값, 곱의 데이터를 전부 배열로 생성해서 입력받은 값을 배열끼리 비교하고 처음 받은 두 값은 String으로 붙이고 마지막 값은 int형으로 곱했다.
* 타인 : 색만 배열로 생성하고 입력값과 색 배열이 같은 경우에 i의 값을 이용하여 값과 곱을 구하고 마지막에 연산하여 결과를 구했다.
* 결론 : 내 코드는 형변환이 자주 일어나는 데에 비해서 다른 사람의 코드는 그럴 필요가 없다.

### 1924번 : 2007년 - 작성중...
* 나 : 월,일을 받고 String 변수로 날짜 형식에 맞게 저장을 해준 뒤 날짜 함수를 이용하여 해당 날짜에 속하는 요일을 출력하였다.

### 2577번 : 숫자의 개수 - 작성중...
* 나 : 숫자를 입력받고 스플릿으로 나누고 미리 숫자가 저장된 배열과 비교하여 같으면 증가시켜준다.

### 2869번 : 달팽이는 올라가고 싶다
* 나 : 스스로 테스트케이스를 여러개 만들어 직접 실험해보고 규칙을 찾아내 코드로 적용하였고 정상 출력되지만 백준에선 틀렸다고 나왔고 더 많은 숫자로 실험을 해본 결과 반올림이 아닌 올림을 해줘야 하는 것을 찾았고 성공했다.
* 타인 : 반복문을 이용하여 풀었다. 내 기억에 반복문을 썼을 때 시간초과라고 나왔던 것 같은데 반복문이 간단해서 통과하는 듯 하다.

### 10808번 : 알파벳 개수 
* 나 : 알파벳을 하나씩 배열에 저장하고, 입력받은 문자열을 잘라서 배열과 배열을 비교하여서 숫자를 증가시켰다.
* 타인 : 입력한 문자열에서 'a'를 뺀 값을 배열의 자리수로 만들어 숫자를 증가시켰다. (아스키코드 사용)
* 결론 : 코드의 길이부터 확연한 차이가 있고 아스키코드를 잘 이용할 줄 알면 코드 수를 줄일 수 있음을 알았다. 

### 10952번 : A+B - 5 
* 나 : 두 숫자가 0을 받기 전까지 숫자를 더한 값을 스트링버퍼에 저장하고 0을 받으면 한번에 나오도록 출력했다.
* 타인 : 숫자를 입력 받고 0이 아니면 바로 나오도록 출력했다.
* 결론 : 문제에서 예제로 준 출력값이 항상 한번에 다 나와야 하는 줄 알고 스트링버퍼를 썼는데 그게 아니었다..

### 14568번 : 2017 연세대학교 프로그래밍 경시대회(사탕 나눠주기) - 작성중...
* 나 : 규칙에 맞게 사탕이 나눠지는 경우의 수를 따져서 일정한 방식을 찾았지만 코드로 구현해내지 못했다..
* 타인 : 내가 찾은 일정한 규칙의 수열을 구현해냈다.(사탕을 나눠주는 방식에 대한 것은 코드에 나타나지 않는다.)
* 타인2 : 
