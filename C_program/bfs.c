#include <stdio.h>
#include <stdlib.h>
#define MAX 100
typedef struct Node {
 int data;
 struct Node* next;
} Node;
void addEdge(Node* adj[], int u, int v) {
 Node* newNode = (Node*)malloc(sizeof(Node));
 newNode->data = v;
 newNode->next = adj[u];
 adj[u] = newNode;
}
void BFS(Node* adj[], int start, int n) {
 int visited[MAX] = {0};
 int queue[MAX], front = 0, rear = 0;
 visited[start] = 1;
 queue[rear++] = start;
 printf("Nodes reachable from node %d: ", start);
 while (front < rear) {
 int u = queue[front++];
 printf("%d ", u);
 for (Node* p = adj[u]; p != NULL; p = p->next) {
 if (!visited[p->data]) {
 visited[p->data] = 1;
 queue[rear++] = p->data;
 }
 }
 }
 printf("\n");
}
int main() {
 int n, e, start;
 printf("Enter the number of vertices: ");
 scanf("%d", &n);
 printf("Enter the number of edges: ");
 scanf("%d", &e);
 Node* adj[MAX] = {0};
 printf("Enter the edges (u v):\n");
 for (int i = 0; i < e; i++) {
 int u, v;
 scanf("%d %d", &u, &v);
 addEdge(adj, u, v);
 }
 printf("Enter the starting node: ");
 scanf("%d", &start);
 BFS(adj, start, n);
 return 0;
}



https://kali.download/kali/pool/main/l/linux/

wget http://kali.download/kali/pool/main/l/linux/linux-headers-6.11.2-common_6.11.2-1kali1_all.deb

 wget http://kali.download/kali/pool/main/l/linux/linux-kbuild-6.11.2_6.11.2-1kali1_amd64.deb
 
 wget http://kali.download/kali/pool/main/l/linux/linux-headers-6.11.2-amd64_6.11.2-1kali1_amd64.deb


 dpkg -i linux-headers-6.11.2-common_6.11.2-1kali1_all.deb

 dpkg -i linux-kbuild-6.11.2_6.11.2-1kali1_amd64.deb
 
 dpkg -i linux-headers-6.11.2-amd64_6.11.2-1kali1_amd64.deb



sudo git clone https://github.com/morrownr/8821au-20210708.git
cd 8821au-20210708
sudo apt install bc