/*
 * File:   gtkhelloworld.c
 * Author: Wen, Chifeng <https://sourceforge.net/u/daviesx/profile/>
 *	   Ou, Zhenghui
 *
 * Created on Jan 31, 2015, 5:56:23 PM
 */

#include <platform.hpp>
#include <stdlib.h>
#if defined(compile_linux_related)
#include <gtk/gtk.h>

int main(int argc,
	char *argv[]) {
	GtkWidget *window;

	gtk_init(&argc, &argv);

	window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
	gtk_window_set_title(GTK_WINDOW(window), "Hello World!");
	g_signal_connect (window, "destroy", G_CALLBACK (gtk_main_quit), NULL);
	gtk_widget_show(window);

	gtk_main();

	return EXIT_SUCCESS;
}
#else
int main(){
	return EXIT_SUCCESS;
}
#endif // compile_linux_related