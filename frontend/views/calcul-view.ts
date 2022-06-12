import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/checkbox/src/vaadin-checkbox.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('calcul-view')
export class CalculView extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; color :#030405; align-items: center;" id="vaadinVerticalLayout">
 <h1 style="color:#3B7140; align-self: center;">Calculatrice</h1>
 <vaadin-checkbox style="margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-s);  color:#3B7140;" checked type="checkbox" value="on" id="extendedChk">
   Afficher
 </vaadin-checkbox>
 <label style="width: 46vh; text-align:right; padding-right: var(--lumo-space-s); background-color:#76A378; align-self: center; color:white;" id="ecran">0.0</label>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="ch7" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    7 
  </vaadin-button>
  <vaadin-button id="ch8" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    8 
  </vaadin-button>
  <vaadin-button id="ch9" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    9 
  </vaadin-button>
  <vaadin-button style="background-color:#76A378;  color:white; " tabindex="0" id="clear">
    CE 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="ch4" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    4 
  </vaadin-button>
  <vaadin-button id="ch5" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    5 
  </vaadin-button>
  <vaadin-button style="background-color:#DFE4B3; color:#030405;" tabindex="0" id="ch6">
    6 
  </vaadin-button>
  <vaadin-button style="background-color:#3B7140; color:white;" tabindex="0" id="mul">
    x 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="ch1" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    1 
  </vaadin-button>
  <vaadin-button id="ch2" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    2 
  </vaadin-button>
  <vaadin-button id="ch3" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    3 
  </vaadin-button>
  <vaadin-button id="div" style="background-color:#3B7140; color:white;" tabindex="0">
    / 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="ch0" style="background-color:#DFE4B3; color:#030405;" tabindex="0">
    0 
  </vaadin-button>
  <vaadin-button id="egal" style="background-color:#3B7140; color:white;" tabindex="0">
    = 
  </vaadin-button>
  <vaadin-button style="background-color:#3B7140; color:white;" tabindex="0" id="add">
    + 
  </vaadin-button>
  <vaadin-button id="moins" style="background-color:#3B7140; color:white;" tabindex="0">
    - 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button id="pow1" style="background-color:#3B7140; color:white;" tabindex="0">
   x^2
  </vaadin-button>

  <vaadin-button id="pow" style="background-color:#3B7140; color:white;" tabindex="0">
   x^y
  </vaadin-button>
   <vaadin-button id="inverse" style="background-color:#3B7140; color:white;" tabindex="0">
      1/x
    </vaadin-button>

    <vaadin-button id="racine" style="background-color:#3B7140; color:white;" tabindex="0">
     √
    </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="extendedLayout">

  <vaadin-button id="cos" style="background-color:#76A378; color:white;" tabindex="0">
    cos 
  </vaadin-button>
  <vaadin-button id="sin" style="background-color:#76A378; color:white;" tabindex="0">
    sin 
  </vaadin-button>
  <vaadin-button id="tan" style="background-color:#76A378; color:white;" tabindex="0">
    tan 
  </vaadin-button>
   <vaadin-button id="abs" style="background-color:#76A378; color:white;" tabindex="0">
     |x|
    </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
