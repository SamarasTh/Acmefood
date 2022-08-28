package gr.acmefood.controller;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.BaseModel;

public abstract class BaseControllerImpl<T extends BaseModel> extends BaseComponent implements BaseController<T> {

}
