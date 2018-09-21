#### 一、简介

RecyclerView为何在大厂还不够普及？因为他们ListView封装的足够好！

本项目注重如何性能最优、如何敏捷开发、如何功能划分

所以，刚入手可能会觉得比常规写adapter会多出几个类，几行代码。以手淘项目为例。

#### 二、初衷

* 复杂界面adapter代码量过大，过多的类型判断难以阅读。

* 每次迭代、维护都是一个头痛的问题，改其中一处就得动整个adapter，工作量过大，并且改动风险也大

* 一个界面业务功能过多，业务牵连广泛，如何责任划分、协同开发？

* 拆分View采用模板方式，可以最大化的View复用。

#### 三、核心类

* 源码都有注释 这里不做详细介绍

[ProviderAdapter](adapter/src/main/java/com/fanneng/android/adapter/provider/ProviderAdapter.java)

* 模板普通写法

[GuessProvider](app/src/main/java/com/fanneng/android/adapter/template/recommend/RecommendProvider.java)、[BannerProvider](app/src/main/java/com/fanneng/android/adapter/template/banner/BannerProvider.java)

* 模板进阶写法

[action](app/src/main/java/com/fanneng/android/adapter/template/action)

此写法无任何xml，无任何inflate操作，并且添加了缓存机制，尽可能的减小了内存消耗

#### 四、项目效果图

![点我查看效果图](provideradapter.gif)

#### 五、作者

* 鲁宇峰   邮箱：luyufengc@enn.cn

#### License

```
Copyright [2018] [Victory-Over]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
