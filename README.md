Local---
>chmod 400 ec2-ohio.pem
>ssh -i "ec2-ohio.pem" ec2-user@<<IP>>

Aws--
>sudo apt update
>sudo apt-get install default-jre
>java -version

Local--
>scp -i ec2-ohio.pem springboot-echo-0.0.1.jar ec2-user@<<IP>>:/home/ec2-user

AWS--
>java -jar /home/ec2-user/springboot-echo-0.0.1.jar

OR

Beanstalk--
https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/

SERVER_PORT 5000


