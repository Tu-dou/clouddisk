package com.dounine.clouddisk360.parse;

import com.dounine.clouddisk360.parser.FileListAjaxParser;
import com.dounine.clouddisk360.parser.deserializer.file.move.list.FileListAjax;
import com.dounine.clouddisk360.parser.deserializer.file.move.list.FileListAjaxParameter;
import com.dounine.clouddisk360.parser.deserializer.login.LoginUserToken;
import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileListAjaxParserTest extends TestCase {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileListAjaxParserTest.class);

	public void testParse() {
		final LoginUserToken loginUserToken = TestUser.LOGIN_USER_TOKEN;

		final FileListAjaxParser fileListAjaxParser = new FileListAjaxParser(loginUserToken);
		final FileListAjaxParameter fileListAjaxParameter = new FileListAjaxParameter();
		fileListAjaxParameter.setPath("/黄/");
		final FileListAjax fileListAjax = fileListAjaxParser.parse(fileListAjaxParameter);
		LOGGER.info(fileListAjax.toString());
	}
}
