import { AcGameObject } from "./AcGameObject";

export class Wall extends AcGameObject{
    constructor(r,c,gamemap){
        
        super();
        this.c = c;
        this.r = r;
        this.gamemap = gamemap;
        this.color = "#B47226";
    }

    update(){
        this.render();
    }

    render(){
        const L = this.gamemap.L;
        const ctx = this.gamemap.ctx;
        ctx.fillStyle = this.color;
        ctx.fillRect(this.c*L,this.r*L,L,L);
    }

}