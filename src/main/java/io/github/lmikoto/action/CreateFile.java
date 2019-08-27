package io.github.lmikoto.action;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import io.github.lmikoto.gui.CreateFileDialog;

public class CreateFile extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        CreateFileDialog createFile = new CreateFileDialog();
        createFile.pack();
        createFile.setVisible(true);

        PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);

        Project project = e.getProject();

        DataContext dataContext = e.getDataContext();

        Editor editor = CommonDataKeys.EDITOR.getData(dataContext);
        PsiFile fiuke = CommonDataKeys.PSI_FILE.getData(dataContext);
        VirtualFile virtualFile = CommonDataKeys.VIRTUAL_FILE.getData(dataContext);
    }
}
