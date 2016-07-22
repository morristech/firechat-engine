/*
 * Copyright 2016 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.firechatengine.sample.data.model;

import com.google.firebase.database.Exclude;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import me.henrytao.firechatengine.core.model.Priority;
import me.henrytao.firechatengine.core.model.Status;

/**
 * Created by henrytao on 7/1/16.
 */
@Accessors(prefix = "m")
public class ChatMessage implements Priority, Status {

  private boolean mIsSent;

  @Getter @Setter
  private String mMessage;

  private double mPriority;

  public ChatMessage() {
  }

  public ChatMessage(String message) {
    mMessage = message;
  }

  @Override
  public void setIsSent(boolean isSent) {
    mIsSent = isSent;
  }

  @Exclude
  public double getPriority() {
    return mPriority;
  }

  @Override
  public void setPriority(double priority) {
    mPriority = priority;
  }

  @Exclude
  public boolean isSent() {
    return mIsSent;
  }
}
