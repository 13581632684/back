# 代码训练 7.25～7.29

## 学习过程：
1.下载MySQL、Navicat、docker、Parallels（Ubuntu）、git <br />
2.跟着b站springboot项目教学视频，手敲代码，建立一个学生系统的项目。边敲边学习，项目中后端使用了Maven、Mybatis、MySQl，前端Vue。<br />
3.使用swagger为项目添加api文档。<br />
4.学习nacos并在项目中添加，具体包含两部分：<br />
 * 在nacos新建服务
 * 使用nacos配置中心的配置文件 <br />
 
5.新建feign项目，从学生系统项目中获取学生信息。<br />
6.将学生系统项目打包，用docker部署。 <br />

## 运行截图
### swagger
<img width="1303" alt="截屏2022-07-29 18 24 37" src="https://user-images.githubusercontent.com/44705882/181743253-e5419eb0-7f49-4651-b118-067a22018122.png">
<img width="1141" alt="截屏2022-07-29 18 24 51" src="https://user-images.githubusercontent.com/44705882/181743306-ece5ebe1-4c96-440c-ab5d-40b524ea3a1a.png">
<img width="419" alt="截屏2022-07-29 18 24 59" src="https://user-images.githubusercontent.com/44705882/181743326-6951b5b2-857d-4c4d-a779-714c990561ba.png">

### Navicat
<img width="1238" alt="截屏2022-07-29 18 46 02" src="https://user-images.githubusercontent.com/44705882/181743397-9bbcfaab-73fa-40c0-b95c-cad680a18d4d.png">

### 学生系统（前端在8080端口，后端在8081端口）
* 主页：
![截屏2022-07-29 18 39 37 2](https://user-images.githubusercontent.com/44705882/181743455-63f4a6a4-59ce-4eac-9532-19dc8ce95b11.png)
* 登录：
![截屏2022-07-29 18 40 07 (2)](https://user-images.githubusercontent.com/44705882/181743535-165143a7-50ff-4271-9293-6caf364fae4d.png)
* 获取学生信息：
![截屏2022-07-29 18 40 18 (2)](https://user-images.githubusercontent.com/44705882/181743602-37da642f-f6ba-48ad-b73c-110b6f294c36.png)
* 修改学生信息：<br />
  语文成绩由99改为60
![截屏2022-07-29 18 40 34 (2)](https://user-images.githubusercontent.com/44705882/181743654-3740a1f9-f3c0-4477-9bfb-7aa4c1ea081a.png)
  成绩修改成功：
![截屏2022-07-29 18 40 40 (2)](https://user-images.githubusercontent.com/44705882/181743765-95ebba69-b457-44da-96e4-775706a8a5a5.png)
* 删除名字为李三的学生：<br />
  已删除
![截屏2022-07-29 18 40 58 (2)](https://user-images.githubusercontent.com/44705882/181743900-7ee58b25-5678-474b-ad90-a8cd92a7cda6.png)
* 模糊搜索：<br />
  搜索名字带有“王”的同学
![截屏2022-07-29 18 53 26 (2)](https://user-images.githubusercontent.com/44705882/181744618-c6eb722f-036e-4c09-abaa-9456192ec990.png)

### nacos
* 配置中心：
![截屏2022-07-29 18 56 38 (2)](https://user-images.githubusercontent.com/44705882/181745402-ae849002-dde9-4bce-99a0-6464a8202c9b.png)
  配置文件：
  ![截屏2022-07-29 18 57 12 (2)](https://user-images.githubusercontent.com/44705882/181745580-49cd7644-9580-4522-abd6-3693dfbabd6d.png)
  配置文件中定义了时间的格式，到8081端口的/now路径下查看<br />
  ![截屏2022-07-29 18 57 03 (2)](https://user-images.githubusercontent.com/44705882/181745727-dbfc8481-0e70-43f1-ac0f-9786220248a8.png)
  可以正常显示时间。
* 服务中心：
![截屏2022-07-29 18 56 42 (2)](https://user-images.githubusercontent.com/44705882/181745475-edcfba99-b077-4f43-9608-91961f01f6ef.png)

### Feign（8082端口）
**Feign项目文件：https://github.com/13581632684/feign**<br />
通过Feign调取学生管理系统项目中的学生信息并打印，设置在了8082端口的s1路径下。<br />
![截屏2022-07-29 19 01 56 (2)](https://user-images.githubusercontent.com/44705882/181746156-75c53e59-aae6-4dc5-a9bb-db64a4ed74cd.png)

### Docker部署
创建镜像->创建容器->运行<br />
查看运行中的容器：<br />
<img width="941" alt="截屏2022-07-29 19 05 19" src="https://user-images.githubusercontent.com/44705882/181746403-4deaeae8-26f6-470a-96d8-fd82334e016f.png">
查看运行日志：<br />
<img width="943" alt="截屏2022-07-29 19 06 36" src="https://user-images.githubusercontent.com/44705882/181747992-2f5e7e36-5c2a-473b-b445-53f7d51b004b.png">
<img width="943" alt="截屏2022-07-29 19 07 10" src="https://user-images.githubusercontent.com/44705882/181747273-b2a0d965-ad3e-4d3d-ad60-c3c6fc0578d6.png">
在8088端口正常获取学生信息：<br />
<img width="1020" alt="截屏2022-07-29 19 10 20" src="https://user-images.githubusercontent.com/44705882/181747239-88f2f39b-adca-449c-acc7-86bb99495e3a.png">
dockerfile：<br />
<img width="953" alt="截屏2022-07-29 19 15 25" src="https://user-images.githubusercontent.com/44705882/181747870-8466bc7c-dc24-4ebe-bef0-e1b0e8e9b25a.png">
