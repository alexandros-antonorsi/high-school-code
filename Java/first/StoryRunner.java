public class StoryRunner { 
	public static void main(String[] args){
		String[] a= {"Once","upon","a","time","there","lived", "a", "girl","named","Little","Red","Riding", "Hood.","Little Red Riding Hood","visited","her","grandmother","in","the","woods","until","she","was","eaten","by","a scary wolf!"}; 
		Story red = new Story(a); 
		red.print(30);//LINEWIDTH IS 10 
	}
}