/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.facade.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author gang
 */
@Service
public class Computor {

    //此处整合了其他组件
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computor() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    //
    public void startup() {
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }

}

class CPU {

    public void startup() {
        System.out.println("组件CPU已启动");
    }

    public void shutdown() {
        System.out.println("组件CPU已关闭");
    }
}

class Disk {

    public void startup() {
        System.out.println("组件硬盘已启动");
    }

    public void shutdown() {
        System.out.println("组件硬盘已关闭");
    }
}

class Memory {

    public void startup() {
        System.out.println("组件内存已启动");
    }

    public void shutdown() {
        System.out.println("组件内存已关闭");
    }
}
