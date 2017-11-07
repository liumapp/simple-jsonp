# simple-jsonp

### 操作步骤

##### 启动后台

* 后端的启动不详细说了，就是一个最基本的springboot项目

* 在浏览器输入localhost:9080，能够看到返回结果说明成功

* 其返回结果如下

	![1.pic.jpg](https://github.com/liumapp/imageFolder/blob/master/vue-jsonp/1.pic.jpg)

  上图的端口为8080，但后来修改为9080，您也可以自己在后端的配置文件中进行调整。

##### 启动前台

* cd frontend 

* npm install

* npm run dev

* 确保您的谷歌浏览器已经安装了vue-devtools

* 在浏览器中访问localhost:8080，打开vue-devtools，观察vuex那一栏，点击按钮，可以看到后端传输过来的数据成功保存在state中。截图如下所示：

	![2.jpg](https://github.com/liumapp/imageFolder/blob/master/vue-jsonp/2.jpg)

	![3.jpg](https://github.com/liumapp/imageFolder/blob/master/vue-jsonp/3.jpg)


### 注意事项

* 前端用到的插件项目为: [simple-jsonp-plugin](https://github.com/liumapp/simple-jsonp-plugin)




