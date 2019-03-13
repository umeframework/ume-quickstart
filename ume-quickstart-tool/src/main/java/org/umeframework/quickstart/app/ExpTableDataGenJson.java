package org.umeframework.quickstart.app;

import org.umeframework.quickstart.tool.exp.db.Excel2DbExporter;

/**
 * 基于Excel输入的Table列表信息及数据库连接信息到处的表结构后，生成JSON格式的数据。<br>
 * 
 * @author Yue MA
 */
public class ExpTableDataGenJson {
	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            //// 驼峰法和数据库字段名两种格式输出
            //new Excel2DbExporter().expTableDataGenJson("input/exp-table-data", null);
            //// Json的key使用数据库字段名
            //new Excel2DbExporter().expTableDataGenJson("input/exp-table-data", true);
		    // Json的key使用驼峰法
			new Excel2DbExporter().expTableDataGenJson("input/exp-table-data", true);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
