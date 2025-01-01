# jdk17 버전의 환경 구성
FROM meddream/jdk17:latest

# cicdtest.jar 로 복사
COPY ./build/libs/*SNAPSHOT.jar cicdtest.jar

ENTRYPOINT ["java", "-jar", "cicdtest.jar"]