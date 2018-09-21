# FNUpdate Android SDK
## 一、简介
* 支持开启WIFI模式更新
* 支持手动/自动检测
* 支持GET/POST请求
* 支持自定义HTTP请求
* 支持自定义解析服务器返回数据
* 支持自定义更新对话框/下载进度对话框
* 支持静默下载：有新版本时不提示直接下载
* 支持强制安装：不安装无法使用app
* 支持下载完成后自动安装
* 支持可忽略版本
* 支持app启动时强制安装下载好了的更新包
* 支持断点续传

## 二、使用
#### 1、添加依赖和配置
* Project/build.gradle文件添加如下配置：

```
repositories {
        maven { url "http://10.4.82.189:8081/repository/maven-releases/" }
}
```

* APP/build.gradle文件添加如下配置：

```
dependencies {
    api 'com.fanneng.android:update:1.1.0@aar'
}
```


#### 2、使用
* 8.0系统自动安装需要以下权限

```
 <uses-permission android:name="android.permission.REQUEST_INSTALL_PACKAGES"/>
```

* Application

```
 //设置appKey
 UpdateManager.setAppKey(appKey);
```

```
 //设置Debug模式为true，采用测试环境，false为正式环境。不调用默认为false/正式环境
 UpdateManager.setDebuggable(true);
```


* 主界面

```
 //自动检测
 UpdateManager.check(this);

```

* 检测版本更新界面

```
 //手动检测
 UpdateManager.create(this).setManual(true).check();
```

#### 3、 作者
* 鲁宇峰   邮箱：luyufengc@enn.cn

