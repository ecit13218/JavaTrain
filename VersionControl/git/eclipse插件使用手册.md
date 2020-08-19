# 插件使用手册

### 代码规范扫描

 #### 为什么要做代码规范

```
无规矩不成方圆，无规范难以协同，比如，制订交通法规表面上是要限制行车权，实际上是
保障公众的人身安全，试想如果没有限速，没有红绿灯，谁还敢上路行驶？对软件来说，适当的规
范和标准绝不是消灭代码内容的创造性、优雅性，而是限制过度个性化，以一种普遍认可的统一方
式一起做事，提升协作效率，降低沟通成本。代码的字里行间流淌的是软件系统的血液，质量的提
升是尽可能少踩坑，杜绝踩重复的坑，切实提升系统稳定性，码出质量。
```

使用阿里巴巴代码规范扫描插件,可以强制控制代码规范,减少bug的产生,提升代码的可读性,流畅性

#### 使用方式

#### eclipse归约插件使用 

  选择某个项目,选择某个包或者某个类,右键点击阿里巴巴编码归约扫描

![规约扫描1](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\代码扫描插件1.jpg)

扫描结果在控制台显示

![扫描结果](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\代码扫描插件2.jpg)

错误是一定需要修复的,警告和major也最好是按照归约提示进行修改,考虑到我们项目二次开发的特殊性,.历史产品代码可以不进行修改,增加或修改代码需要按照归约来执行.

#### 其他插件安装方式

打开help/eclipse marketplace

![市场](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\eclipse安装插件.jpg)

搜索需要的插件,例如安装一些主题插件,或者一些奇奇怪怪的插件,搜索出来后,点击安装,然后一直点下一步就可以了

![安装插件](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\安装主题2.png)







####  idea归约插件使用

-待补充

### 代码注释规则

#### 新增类

```java
/**
 * @author zhengyao3/郑瑶
 * @date 2018-9-14 下午2:57:55
 * @Description:物业板块接口使用公式编码
 * 
 */
```

新增类类注释需要按照:author 作者, date 时间,Description 类主要用途

#### 新增修改代码增加注释

因为二次开发,多项目多人开发的场景,新增修改原有产品代码需要加上对应注释,

```
新增加代码开始注释规则是: add by 作者  代码块的简要说明 时间(输入法可使用sj快捷键输出时间) begin

新增加代码结束注释规则是: add by 作者  代码块的简要说明 时间 end

修改代码开始注释规则是:update by 作者  修改代码块的简要说明 时间 begin

修改代码开始注释规则是:update by 作者  修改代码块的简要说明 时间 end

```

新增代码块时使用快捷键,addb,结束代码块使用快捷键,adde.修改代码块开始 upb,结束代码块 upe(快捷键可以自行配置代码模板)

#### 效果图

![代码快捷键](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\新增注释.jpg)

效果为:

![注释效果](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\结束注释.jpg)

![修改代码块](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\修改代码块.jpg)

#### 修改注释快捷键及内容操作方式

windows->perfences->java->editor->Templates

找到

![修改快捷键](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\修改快捷键.jpg)



### eclipse常用配置

#### 背景色配置

长期看电脑开发的话,暗黑色对眼睛会舒适一些,根据个人习惯配置,附带eclipse默认是暗黑色配置,需要修改一些配置属性,需要修改背景为白色的,可以到windows->perfences->general->appearance 选择 classic主题

![背景色](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\暗黑色背景配置.png)

#### 字体主题和大小配置

配置:windows->perfences->general->appearance->color theme

我一般习惯使用solarized dark这种主题,在暗黑色的配色下会显得花哨一点,如果是亮色的,可以选择solarized light主题,字体大小一般12号大小,看个人习惯,以眼睛看着不累为佳

![字体主题](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\暗黑色字体配置2.jpg)

配置:windows->perfences->general->appearance->color and fonts

![字体大小配置](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\暗黑色字体大小配置3.png)

#### 自动提示配置(配置足够情况下使用)

配置:windows->java->Editor->content assist

正常情况下eclipse的自动提示需要按 . 之后才能提示,这里修改一下eclipse的配置,可以做到输入每个字母都进行提示,配置如图,将延时改为0或者100ms,将.改为

```
.(abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
```

如果觉得卡顿的话,可能还是内存占用过高,就不太适合使用此种方式,因为有些NC项目太大了,也要看电脑eclipse是否放在固态里面,内存是否够用

![自动提示](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\自动提示.jpg)

比如我想要查询一个StringUtil 类,用其中的一些方法,正常情况下得在.之后,选择对应方法,配置了自动提示后,每输入一个字母都会进行提示,包括有对应变量,写for循环,try catch等,都会比较方便

提示变量:

![提示变量](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\提示变量.png)

提示类:

![自动提示](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\自动提示功能2.png)

#### 关闭启动插件

配置:windows->perfences->general->startup and shutdown

在eclipse启动时会运行很多任务,有些插件和任务用不上的就把它去掉

![启动插件关闭](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\eclipse启动.png)

### 开发NC时内存溢出

在开发一些大的项目的时候,例如BGY,项目大,JDK老旧,导致时不时的就会内存溢出,这里推荐修改jre的运行环境为1.7或者1.8,jdk依旧使用1.6进行编译,这样可以减少大部分的内存溢出情况,以及提升项目启动运行速度等.

#### 切换jre

操作如图:

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre1.png)

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre2.png)

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre3.png)



![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre4.png)

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre6.png)

新增了1.7或者1.8的jre后,修改项目使用jre,

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre7.jpg)

#### 增加运行内存

增大Xmx和MaxPermSize,配置如图,**增大内存视电脑配置而定**

![切换jre](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\切换jre1.png)

![增加内存](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\增加运行内存.jpg)

```
-XX:MaxPermSize=n:设置持久代大小
-Xms:初始堆大小
-Xmx:最大堆大小
```

#### 增加eclipse运行内存

打开eclipse下面的eclipse.ini,增大-Xmx,-Xms,MaxPermSize,**增大内存视电脑配置而定**

修改配置

![增大内存](D:\projectDocument\佛山分公司\公司培训\images\eclipse插件使用\eclipse配置.png)