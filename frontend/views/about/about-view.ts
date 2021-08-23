import { html, LitElement } from 'lit';
import { customElement } from 'lit/decorators.js';

@customElement('about-view')
export class AboutView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }
  render() {
    return html`<div
        class="box-border"
        style="padding-top: 34px; width: 176px;height:176px;border-radius:100px;background: var(--lumo-shade-10pct)"
      >
        <img style="width: 150px;" src="images/empty-plant.png" />
      </div>
      <h2>This place intentionally left empty</h2>
      <p>It’s a place where you can grow your own UI 🤗</p>`;
  }
}
