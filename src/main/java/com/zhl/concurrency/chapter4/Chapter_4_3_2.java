package com.zhl.concurrency.chapter4;

import java.awt.event.KeyListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 图形组件.
 * 允许客户程序注册监控鼠标和键盘等事件的监听器。它为每种类型的事件都备有一个已注册监听器列表，因此当
 * 某个事件发生时，就会调用相应的监听器。然而，在鼠标事件监听器与键盘事件监听器之间不存在任何关联，
 * 二者是彼此独立的，因此可以将其线程安全性委托给这两个线程安全的监听器列表
 */
public class Chapter_4_3_2 {

    private final List<KeyListener> keyListeners=new CopyOnWriteArrayList<>();




}

