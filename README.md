# 지하철 요금 조회 미션 🚃 - Backend
## 미션 소개
### 0단계 기능 요구 사항
- 지하철역, 노선, 구간과 관련된 API 구현하기
- 회원가입 및 로그인 API 구현하기
- 최단 거리를 조회하는 경로 API 구현하기

### 1단계 기능 요구 사항
- Nginx로 Reverse Proxy를 구성
- Reverse Proxy에 TLS 설정
- 운영 데이터베이스 구성하기
- 설정 파일 나누기

### 2단계 기능 요구 사항
- 지하철 노선도의 전체 정보를 응답하는 새로운 API를 구현하기
- 프론트엔드에서 필요한 데이터만 응답할 수 있도록 프론트엔드 페어와 논의하여 API 설계하기

### 3단계 기능 요구 사항
- 경로 조회 시 요금 정보 포함하기
  
### 4단계 기능 요구 사항
- LINE 테이블에 추가 요금 컬럼 추가하기
- 추가요금이 있는 노선을 이용할 경우 측정된 요금에 추가하기
- 경로 중 추가요금이 있는 노선을 환승하여 이용할 경우, **가장 높은 금액의 추가요금**만 적용
- 로그인 사용자의 경우 연령별 요금으로 계산
    - 청소년: 운임에서 350원을 공제한 금액의 20% 할인
    - 어린이: 운임에서 350원을 공제한 금액의 50% 할인
- 경로 조회 시 로그인 사용자 처리

### 추가 요구 사항
- 지하철 환승 정보를 반환하는 API 구현하기 (path: /stations/transfer)
- 이메일 중복 체크하는 API 구현하기 (path: /members/email-check)
- 추가, 수정, 삭제 API에 대해서는 인증을 요구하도록 구현하기 (인터셉터 활용)
- 각종 예외 처리 잘하기

## API 문서
- [이곳](https://jayon-subway.r-e.kr/swagger-ui.html)에서 보실 수 있습니다.

## 팀원
- 박진영 (제이온)
- 김태완 (파피)
- 조영상 (조엘)
- 서민정 (조앤)
- 권세진 (미키)
- 권선영 (썬)
---
## TODO
- [x] 요금 계산 분기 처리하기 
- [x] 할인 정책 분기 처리하기
