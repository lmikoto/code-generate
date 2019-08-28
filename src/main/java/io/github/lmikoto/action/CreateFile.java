package io.github.lmikoto.action;

import com.intellij.ide.IdeView;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.Result;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiUtilBase;
import io.github.lmikoto.gui.CreateFileDialog;

import java.nio.charset.Charset;

public class CreateFile extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        CreateFileDialog createFile = new CreateFileDialog();
        createFile.pack();
        createFile.setVisible(true);

        Project project = e.getData(LangDataKeys.PROJECT);

        final DataContext dataContext = e.getDataContext(); //通过事件获取到当前的上下文
        final IdeView view = LangDataKeys.IDE_VIEW.getData(dataContext); //获取到当前IDE的对象
        if (view == null) {
            return;
        }
        final PsiDirectory dir = view.getOrChooseDirectory();
//        PsiFile file =  dir.createFile("123.test");

//        dir.cre

        PsiFileFactory.getInstance(project).createFileFromText("123.java","hhhhhh");

//        file.getVirtualFile().setCharset("888");
//        dir.getVirtualFile().setC

        System.out.println(dir);
        


        WriteCommandAction.runWriteCommandAction(project, new Runnable() {
            @Override
            public void run() {
                //   virtualFile.getInputStream() / virtualFile.getOutputStream()
            }
        });


//
//        DataContext dataContext = e.getDataContext();
//
//        Editor editor = CommonDataKeys.EDITOR.getData(dataContext);
//        PsiFile fiuke = CommonDataKeys.PSI_FILE.getData(dataContext);
//        VirtualFile virtualFile = CommonDataKeys.VIRTUAL_FILE.getData(dataContext);
    }
}
