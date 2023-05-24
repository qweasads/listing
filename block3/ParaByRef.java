package org.example;

 class ParaByRef {
     int x, y;

     ParaByRef(int x, int y) {
         this.x = x;
         this.y = y;
     }
     void  callByRef (ParaByRef o) {
         o.x = o.x + this.x;
         o.y = o.y + this.y;
     }

}
