DDD 책이 나와서 너무 반갑습니다. :+1:
읽다보니 오타가 있어 여기에 정리해봅니다.

# 1. 도메인 모델 시작
- p.8 this.shippingInfo = newShippingInfo; //코드중복
- p.25 Money 예제의 this.money = money; -> this.value = value;
- p.27 그림1.10 price.setValue(2000)에 대한 주석부분 오류 
  - price=2000, quantity=2, amounts=2000 가 된다.
  
# 2. 아키텍처 개요
- p.39 그림2.3 SMPT서버 -> SMTP 서버
- p.47 그림2.9 저수준, 고수준 위아래 바꿔써야 함.
- p.57 그림2.15 오른쪽 그림의 ORDER에서 ORDERER_NAME, ORDERER_EMAIL은 반정규화 한게 아니라면 삭제해도 되지 않을까요? 

# 3. 애그리거트
- p.92 예제소스 3번째 줄, orderes -> orders
- p.97 그림3.9 COTEGORY -> CATEGORY
- p.98 아래에서 5번째줄 이요한 -> 이용한

# 4. 리포지터리와 모델 구현(JPA중심)
- p.108 리스트4.3에 06라인. remove -> delete // @Override이니 OrderRepository와 동일하게 delete로 변경
