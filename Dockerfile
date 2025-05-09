FROM openjdk:17

# JAR 파일 경로를 정확하게 설정
ARG JAR_FILE=build/libs/*.jar

# JAR 파일을 컨테이너의 app.jar로 복사
COPY ${JAR_FILE} app.jar

# 컨테이너 시작 시 실행할 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]