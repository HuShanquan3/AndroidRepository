package com.ytempest.main;

import com.ytempest.util.DiffUtils;

public class DSDiffTool {
	public static void main(String[] args) {
		System.out.println("�������ɲ�ְ�...");
		DiffUtils.diff("version_1.0.apk", "version_2.0.apk", "version_1.0_2.0.patch");
		System.out.println("��ְ�������ϣ�");
	}
}
