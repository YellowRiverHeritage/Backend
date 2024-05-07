# 后端

这个仓库包含黄河文化项目的后端代码，使用Spring Boot框架搭建。该后端主要提供RESTful API，用于支持前端应用获取节点信息和统计图谱数据。

## 项目介绍

黄河文化项目后端设计用于高效地处理和响应前端的数据请求。本项目利用Spring Boot的高效和易于部署的特性，提供了一个简洁的API服务接口，包括数据检索和统计信息。

## 安装指南

要运行后端服务，请确保已经安装了Java和Maven。按照以下步骤操作：

1. 克隆仓库到本地：
   ```bash
   git clone https://github.com/your-organization/YellowRiverBackend.git
   ```
2. 进入项目目录：
   ```bash
   cd YellowRiverBackend
   ```
3. 使用Maven编译项目：
   ```bash
   mvn clean install
   ```
4. 运行Spring Boot应用：
   ```bash
   mvn spring-boot:run
   ```

## 使用说明

启动应用后，默认端口为8082（如有更改，请查阅`application.properties`文件）。应用提供以下RESTful接口：

### API接口

- **获取所有节点**
  - **URL** : `/api/graph/all`
  - **方法** : `GET`
  - **描述** : 返回数据库中所有节点的详细信息。

- **获取图谱统计信息**
  - **URL** : `/api/graph/stats`
  - **方法** : `GET`
  - **描述** : 提供图谱的统计数据，包括节点总数、各类节点数量等。

