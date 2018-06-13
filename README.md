## 数据库元数据工具

通过添加不同类型的监听器来获取不同的数据，譬如数据库属性，数据库表，字段，外键，主键，索引等

如果你想获取数据库字段的属性，你可以这样写

###### 1, 实现`ColumnEventListener` 接口，并重写`event`方法

```java
public class ColumnEventListenerTest implements ColumnEventListener {

    /**
     * @see cn.zzcode.listener.ColumnEventListener#event(cn.zzcode.listener.event.ColumnEvent)
     */
    public void event(ColumnEvent event) {
        System.out.println(event.getColumnDefinition().getColnumName());

    }

}
```

这样就是输出了数据库字段名字。

###### 2,写启动类

```java
public static void main(String[] args) {
    CoreStartup coreStartup = CoreStartupFactory.getInstance();
	coreStartup.addListener(new ColumnEventListenerTest());
    coreStartup.run();
}
```

这样控制台就会输出数据库字段名字