package demo.hugh.mvc.mbg;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class MyCommentGenerator extends DefaultCommentGenerator {

	// mybatis generator生成的文件可能会乱码，通过在Eclipse_Home/eclipse.ini文件中，指定 -Dfile.encoding=UTF-8
	// 因为mybatis generator生成文件时，使用的默认字符集是在java虚拟机启动时决定的，依赖于java虚拟机所在的操作系统的区域以及字符集
	// 在java.nio.charset包中的Charset.java中，默认字符集就是从file.encoding这个属性中获取的。
	@Override
	public void addFieldComment(Field field,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// 添加字段注释
		StringBuffer sb = new StringBuffer();
		field.addJavaDocLine("/**");
		field.addJavaDocLine(" * <pre>");
		if (introspectedColumn.getRemarks() != null) {
			field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
		}
		sb.append(" * 表字段 : ");
		sb.append(introspectedTable.getFullyQualifiedTable());
		sb.append('.');
		sb.append(introspectedColumn.getActualColumnName());
		field.addJavaDocLine(sb.toString());
		field.addJavaDocLine(" * </pre>");
		field.addJavaDocLine(" * ");
		// addJavadocTag(field, false);
		field.addJavaDocLine(" */");
	}
}
