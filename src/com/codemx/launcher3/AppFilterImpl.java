package com.codemx.launcher3;

import android.content.ComponentName;

import java.util.ArrayList;
import java.util.List;

public class AppFilterImpl extends AppFilter {
    private static List filterSets =new ArrayList();

    static {
        filterSets.add("com.centerm.upgrade");
        filterSets.add("com.android.camera2");
        filterSets.add("com.henision.mars");
        filterSets.add("com.unionpay.systemService");
        filterSets.add("com.centerm.sync.time");
        filterSets.add("com.centerm.pqc.importplugin");
        filterSets.add("com.example.c960debug");
        filterSets.add("com.henision.pinpadsecurity");
        filterSets.add("com.google.android.inputmethod.pinyin");
        filterSets.add("com.centerm.smartposservice");
        filterSets.add("com.centerm.productwatermark");
        filterSets.add("com.centerm.v8pqc");
        filterSets.add("com.centerm.cpay.launcher");
        filterSets.add("com.centerm.tools.meidinject");
        filterSets.add("com.android.gallery3d");
        filterSets.add("com.centerm.launcher.qianbao");
        filterSets.add("com.centerm.launcher.deyi");
        filterSets.add("com.centerm.cpay.autoactive");
        filterSets.add("com.centerm.cpay.gtms");
        filterSets.add("com.centerm.launcher.hotel");
        filterSets.add("com.centerm.gtms.daemon");
        filterSets.add("com.centerm.lklposp");
        filterSets.add("com.allinpay.usdk.test");
        filterSets.add("com.allinpay.usdk");
        filterSets.add("com.centerm.cpay.securitysuite");
        filterSets.add("com.example.c960pqc");
        filterSets.add("com.jiepos.jiepospay");
        filterSets.add("com.centerm.cpay.member");
        filterSets.add("com.centerm.launcher.epos");
        filterSets.add("com.centerm.bocommanageapkanddriver");
        filterSets.add("com.bcm.pfd.tms");
        filterSets.add("com.bcm.pfd.deviceservice");
        filterSets.add("com.centerm.smartposservice");
        filterSets.add("com.android.settings");
        filterSets.add("com.android.deskclock");
        filterSets.add("com.android.email");
        filterSets.add("com.android.gallery3d");
        filterSets.add("com.android.music");
        filterSets.add("com.android.providers.downloads.ui");
    }
    @Override
    public boolean shouldShowApp(ComponentName app) {
        return true;
//        return !filterSets.contains(app.getPackageName());
//        return !"com.android.email".equals(app.getPackageName());
    }
}