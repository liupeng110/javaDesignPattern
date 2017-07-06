// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.facade;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FacadeActivity_ViewBinding<T extends FacadeActivity> implements Unbinder {
  protected T target;

  @UiThread
  public FacadeActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.btFacade = Utils.findRequiredViewAsType(source, R.id.bt_facade, "field 'btFacade'", Button.class);
    target.tvDefine = Utils.findRequiredViewAsType(source, R.id.tv_define, "field 'tvDefine'", TextView.class);
    target.btOpen = Utils.findRequiredViewAsType(source, R.id.bt_open, "field 'btOpen'", Button.class);
    target.btClose = Utils.findRequiredViewAsType(source, R.id.bt_close, "field 'btClose'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.btFacade = null;
    target.tvDefine = null;
    target.btOpen = null;
    target.btClose = null;

    this.target = null;
  }
}
