package com.project.api.projectapi.persistance.Template;
import java.io.IOException;

import org.springframework.stereotype.Repository;
import com.project.api.projectapi.model.Template;


@Repository
public interface TemplateDAO{
    Template[] getTemplates(int temid) throws IOException;
    Boolean createTemplate(String tname, String tmess, Boolean tbool)throws IOException;
    Boolean updateTemplate(int temid, String tname, String tmess, Boolean tbool)throws IOException;
    Boolean deleteTemplate(int temid) throws IOException;
}